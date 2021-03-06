/*
 * This file is part of CoAnSys project.
 * Copyright (c) 2012-2013 ICM-UW
 * 
 * CoAnSys is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * CoAnSys is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with CoAnSys. If not, see <http://www.gnu.org/licenses/>.
 */

package pl.edu.icm.coansys.models;

public final class MostPopularProtos {
  private MostPopularProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ResourceStatOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string resource_id = 1;
    boolean hasResourceId();
    String getResourceId();
    
    // required int64 counter = 2;
    boolean hasCounter();
    long getCounter();
  }
  public static final class ResourceStat extends
      com.google.protobuf.GeneratedMessage
      implements ResourceStatOrBuilder {
    // Use ResourceStat.newBuilder() to construct.
    private ResourceStat(Builder builder) {
      super(builder);
    }
    private ResourceStat(boolean noInit) {}
    
    private static final ResourceStat defaultInstance;
    public static ResourceStat getDefaultInstance() {
      return defaultInstance;
    }
    
    public ResourceStat getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.edu.icm.coansys.models.MostPopularProtos.internal_static_pl_edu_icm_coansys_models_ResourceStat_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.edu.icm.coansys.models.MostPopularProtos.internal_static_pl_edu_icm_coansys_models_ResourceStat_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string resource_id = 1;
    public static final int RESOURCE_ID_FIELD_NUMBER = 1;
    private java.lang.Object resourceId_;
    public boolean hasResourceId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getResourceId() {
      java.lang.Object ref = resourceId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          resourceId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getResourceIdBytes() {
      java.lang.Object ref = resourceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        resourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int64 counter = 2;
    public static final int COUNTER_FIELD_NUMBER = 2;
    private long counter_;
    public boolean hasCounter() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getCounter() {
      return counter_;
    }
    
    private void initFields() {
      resourceId_ = "";
      counter_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasResourceId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCounter()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getResourceIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, counter_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getResourceIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, counter_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements pl.edu.icm.coansys.models.MostPopularProtos.ResourceStatOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return pl.edu.icm.coansys.models.MostPopularProtos.internal_static_pl_edu_icm_coansys_models_ResourceStat_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return pl.edu.icm.coansys.models.MostPopularProtos.internal_static_pl_edu_icm_coansys_models_ResourceStat_fieldAccessorTable;
      }
      
      // Construct using pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        resourceId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        counter_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.getDescriptor();
      }
      
      public pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat getDefaultInstanceForType() {
        return pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.getDefaultInstance();
      }
      
      public pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat build() {
        pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat buildPartial() {
        pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat result = new pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.resourceId_ = resourceId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.counter_ = counter_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat) {
          return mergeFrom((pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat other) {
        if (other == pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.getDefaultInstance()) return this;
        if (other.hasResourceId()) {
          setResourceId(other.getResourceId());
        }
        if (other.hasCounter()) {
          setCounter(other.getCounter());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasResourceId()) {
          
          return false;
        }
        if (!hasCounter()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              resourceId_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              counter_ = input.readInt64();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string resource_id = 1;
      private java.lang.Object resourceId_ = "";
      public boolean hasResourceId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getResourceId() {
        java.lang.Object ref = resourceId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          resourceId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setResourceId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        resourceId_ = value;
        onChanged();
        return this;
      }
      public Builder clearResourceId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        resourceId_ = getDefaultInstance().getResourceId();
        onChanged();
        return this;
      }
      void setResourceId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        resourceId_ = value;
        onChanged();
      }
      
      // required int64 counter = 2;
      private long counter_ ;
      public boolean hasCounter() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getCounter() {
        return counter_;
      }
      public Builder setCounter(long value) {
        bitField0_ |= 0x00000002;
        counter_ = value;
        onChanged();
        return this;
      }
      public Builder clearCounter() {
        bitField0_ = (bitField0_ & ~0x00000002);
        counter_ = 0L;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:pl.edu.icm.coansys.models.ResourceStat)
    }
    
    static {
      defaultInstance = new ResourceStat(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:pl.edu.icm.coansys.models.ResourceStat)
  }
  
  public interface MostPopularStatsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 timestamp = 1;
    boolean hasTimestamp();
    long getTimestamp();
    
    // repeated .pl.edu.icm.coansys.models.ResourceStat stat = 2;
    java.util.List<pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat> 
        getStatList();
    pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat getStat(int index);
    int getStatCount();
    java.util.List<? extends pl.edu.icm.coansys.models.MostPopularProtos.ResourceStatOrBuilder> 
        getStatOrBuilderList();
    pl.edu.icm.coansys.models.MostPopularProtos.ResourceStatOrBuilder getStatOrBuilder(
        int index);
  }
  public static final class MostPopularStats extends
      com.google.protobuf.GeneratedMessage
      implements MostPopularStatsOrBuilder {
    // Use MostPopularStats.newBuilder() to construct.
    private MostPopularStats(Builder builder) {
      super(builder);
    }
    private MostPopularStats(boolean noInit) {}
    
    private static final MostPopularStats defaultInstance;
    public static MostPopularStats getDefaultInstance() {
      return defaultInstance;
    }
    
    public MostPopularStats getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.edu.icm.coansys.models.MostPopularProtos.internal_static_pl_edu_icm_coansys_models_MostPopularStats_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.edu.icm.coansys.models.MostPopularProtos.internal_static_pl_edu_icm_coansys_models_MostPopularStats_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int64 timestamp = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private long timestamp_;
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getTimestamp() {
      return timestamp_;
    }
    
    // repeated .pl.edu.icm.coansys.models.ResourceStat stat = 2;
    public static final int STAT_FIELD_NUMBER = 2;
    private java.util.List<pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat> stat_;
    public java.util.List<pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat> getStatList() {
      return stat_;
    }
    public java.util.List<? extends pl.edu.icm.coansys.models.MostPopularProtos.ResourceStatOrBuilder> 
        getStatOrBuilderList() {
      return stat_;
    }
    public int getStatCount() {
      return stat_.size();
    }
    public pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat getStat(int index) {
      return stat_.get(index);
    }
    public pl.edu.icm.coansys.models.MostPopularProtos.ResourceStatOrBuilder getStatOrBuilder(
        int index) {
      return stat_.get(index);
    }
    
    private void initFields() {
      timestamp_ = 0L;
      stat_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTimestamp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getStatCount(); i++) {
        if (!getStat(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, timestamp_);
      }
      for (int i = 0; i < stat_.size(); i++) {
        output.writeMessage(2, stat_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, timestamp_);
      }
      for (int i = 0; i < stat_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, stat_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStatsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return pl.edu.icm.coansys.models.MostPopularProtos.internal_static_pl_edu_icm_coansys_models_MostPopularStats_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return pl.edu.icm.coansys.models.MostPopularProtos.internal_static_pl_edu_icm_coansys_models_MostPopularStats_fieldAccessorTable;
      }
      
      // Construct using pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getStatFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (statBuilder_ == null) {
          stat_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          statBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats.getDescriptor();
      }
      
      public pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats getDefaultInstanceForType() {
        return pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats.getDefaultInstance();
      }
      
      public pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats build() {
        pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats buildPartial() {
        pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats result = new pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.timestamp_ = timestamp_;
        if (statBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            stat_ = java.util.Collections.unmodifiableList(stat_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.stat_ = stat_;
        } else {
          result.stat_ = statBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats) {
          return mergeFrom((pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats other) {
        if (other == pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats.getDefaultInstance()) return this;
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (statBuilder_ == null) {
          if (!other.stat_.isEmpty()) {
            if (stat_.isEmpty()) {
              stat_ = other.stat_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureStatIsMutable();
              stat_.addAll(other.stat_);
            }
            onChanged();
          }
        } else {
          if (!other.stat_.isEmpty()) {
            if (statBuilder_.isEmpty()) {
              statBuilder_.dispose();
              statBuilder_ = null;
              stat_ = other.stat_;
              bitField0_ = (bitField0_ & ~0x00000002);
              statBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getStatFieldBuilder() : null;
            } else {
              statBuilder_.addAllMessages(other.stat_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTimestamp()) {
          
          return false;
        }
        for (int i = 0; i < getStatCount(); i++) {
          if (!getStat(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              timestamp_ = input.readInt64();
              break;
            }
            case 18: {
              pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.Builder subBuilder = pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addStat(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int64 timestamp = 1;
      private long timestamp_ ;
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getTimestamp() {
        return timestamp_;
      }
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000001;
        timestamp_ = value;
        onChanged();
        return this;
      }
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        timestamp_ = 0L;
        onChanged();
        return this;
      }
      
      // repeated .pl.edu.icm.coansys.models.ResourceStat stat = 2;
      private java.util.List<pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat> stat_ =
        java.util.Collections.emptyList();
      private void ensureStatIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          stat_ = new java.util.ArrayList<pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat>(stat_);
          bitField0_ |= 0x00000002;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat, pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.Builder, pl.edu.icm.coansys.models.MostPopularProtos.ResourceStatOrBuilder> statBuilder_;
      
      public java.util.List<pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat> getStatList() {
        if (statBuilder_ == null) {
          return java.util.Collections.unmodifiableList(stat_);
        } else {
          return statBuilder_.getMessageList();
        }
      }
      public int getStatCount() {
        if (statBuilder_ == null) {
          return stat_.size();
        } else {
          return statBuilder_.getCount();
        }
      }
      public pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat getStat(int index) {
        if (statBuilder_ == null) {
          return stat_.get(index);
        } else {
          return statBuilder_.getMessage(index);
        }
      }
      public Builder setStat(
          int index, pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat value) {
        if (statBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStatIsMutable();
          stat_.set(index, value);
          onChanged();
        } else {
          statBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setStat(
          int index, pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.Builder builderForValue) {
        if (statBuilder_ == null) {
          ensureStatIsMutable();
          stat_.set(index, builderForValue.build());
          onChanged();
        } else {
          statBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addStat(pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat value) {
        if (statBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStatIsMutable();
          stat_.add(value);
          onChanged();
        } else {
          statBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addStat(
          int index, pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat value) {
        if (statBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStatIsMutable();
          stat_.add(index, value);
          onChanged();
        } else {
          statBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addStat(
          pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.Builder builderForValue) {
        if (statBuilder_ == null) {
          ensureStatIsMutable();
          stat_.add(builderForValue.build());
          onChanged();
        } else {
          statBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addStat(
          int index, pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.Builder builderForValue) {
        if (statBuilder_ == null) {
          ensureStatIsMutable();
          stat_.add(index, builderForValue.build());
          onChanged();
        } else {
          statBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllStat(
          java.lang.Iterable<? extends pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat> values) {
        if (statBuilder_ == null) {
          ensureStatIsMutable();
          super.addAll(values, stat_);
          onChanged();
        } else {
          statBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearStat() {
        if (statBuilder_ == null) {
          stat_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          statBuilder_.clear();
        }
        return this;
      }
      public Builder removeStat(int index) {
        if (statBuilder_ == null) {
          ensureStatIsMutable();
          stat_.remove(index);
          onChanged();
        } else {
          statBuilder_.remove(index);
        }
        return this;
      }
      public pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.Builder getStatBuilder(
          int index) {
        return getStatFieldBuilder().getBuilder(index);
      }
      public pl.edu.icm.coansys.models.MostPopularProtos.ResourceStatOrBuilder getStatOrBuilder(
          int index) {
        if (statBuilder_ == null) {
          return stat_.get(index);  } else {
          return statBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends pl.edu.icm.coansys.models.MostPopularProtos.ResourceStatOrBuilder> 
           getStatOrBuilderList() {
        if (statBuilder_ != null) {
          return statBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(stat_);
        }
      }
      public pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.Builder addStatBuilder() {
        return getStatFieldBuilder().addBuilder(
            pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.getDefaultInstance());
      }
      public pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.Builder addStatBuilder(
          int index) {
        return getStatFieldBuilder().addBuilder(
            index, pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.getDefaultInstance());
      }
      public java.util.List<pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.Builder> 
           getStatBuilderList() {
        return getStatFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat, pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.Builder, pl.edu.icm.coansys.models.MostPopularProtos.ResourceStatOrBuilder> 
          getStatFieldBuilder() {
        if (statBuilder_ == null) {
          statBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat, pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.Builder, pl.edu.icm.coansys.models.MostPopularProtos.ResourceStatOrBuilder>(
                  stat_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          stat_ = null;
        }
        return statBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:pl.edu.icm.coansys.models.MostPopularStats)
    }
    
    static {
      defaultInstance = new MostPopularStats(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:pl.edu.icm.coansys.models.MostPopularStats)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_pl_edu_icm_coansys_models_ResourceStat_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_pl_edu_icm_coansys_models_ResourceStat_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_pl_edu_icm_coansys_models_MostPopularStats_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_pl_edu_icm_coansys_models_MostPopularStats_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021mostpopular.proto\022\031pl.edu.icm.coansys." +
      "models\"4\n\014ResourceStat\022\023\n\013resource_id\030\001 " +
      "\002(\t\022\017\n\007counter\030\002 \002(\003\"\\\n\020MostPopularStats" +
      "\022\021\n\ttimestamp\030\001 \002(\003\0225\n\004stat\030\002 \003(\0132\'.pl.e" +
      "du.icm.coansys.models.ResourceStatB.\n\031pl" +
      ".edu.icm.coansys.modelsB\021MostPopularProt" +
      "os"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_pl_edu_icm_coansys_models_ResourceStat_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_pl_edu_icm_coansys_models_ResourceStat_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_pl_edu_icm_coansys_models_ResourceStat_descriptor,
              new java.lang.String[] { "ResourceId", "Counter", },
              pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.class,
              pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat.Builder.class);
          internal_static_pl_edu_icm_coansys_models_MostPopularStats_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_pl_edu_icm_coansys_models_MostPopularStats_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_pl_edu_icm_coansys_models_MostPopularStats_descriptor,
              new java.lang.String[] { "Timestamp", "Stat", },
              pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats.class,
              pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
